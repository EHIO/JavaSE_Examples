import java.util.List;

public class PasswordUtils {
	@UseCase(id = 1, description = "good good study")
	public boolean vaildatePassword(String password) {
		return (password.contains("\\w\\d\\w"));
	}

	@UseCase(id = 2)
	public String encryptPassword(String password) {
		return new StringBuilder(password).reverse().toString();
	}

	@UseCase(id = 3, description = "day day up")
	public boolean ckeckForNewPassword(List<String> prevPasswords, String password) {
		return !prevPasswords.contains(password);
	}
}
