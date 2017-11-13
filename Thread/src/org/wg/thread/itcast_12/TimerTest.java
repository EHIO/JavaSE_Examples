package org.wg.thread.itcast_12;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
 * ������ָ����ʱ��ɾ�����ǵ�ָ��Ŀ¼(�����ָ��c�̣������Ҳ����飬��ʹ����Ŀ·���µ�demo)
 */

class DeleteFolder extends TimerTask {

	@Override
	public void run() {
		File srcFolder = new File("demo");
		deleteFolder(srcFolder);
	}

	// �ݹ�ɾ��Ŀ¼
	public void deleteFolder(File srcFolder) {
		File[] fileArray = srcFolder.listFiles();
		if (fileArray != null) {
			for (File file : fileArray) {
				if (file.isDirectory()) {
					deleteFolder(file);
				} else {
					System.out.println(file.getName() + ":" + file.delete());
				}
			}
			System.out.println(srcFolder.getName() + ":" + srcFolder.delete());
		}
	}
}

public class TimerTest {
	public static void main(String[] args) throws ParseException {
		Timer t = new Timer();

		String s = "2014-11-27 15:45:00";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = sdf.parse(s);

		t.schedule(new DeleteFolder(), d);
	}
}
