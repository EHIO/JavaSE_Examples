package structural.proxy.javaproxy.example2;

/**
 * 约会服务系统
 * 顾客只可以修改自己的信息， 但不能对自己进行评分;
 * 顾客不能修改他人信息， 但可以对其他顾客进行评分
 */
public interface PersonBean {

    String getName();

    String getGender();

    String getInterests();

    int getHotOrNotRating();

    void setName(String name);

    void setGender(String gender);

    void setInterests(String interests);

    void setHotOrNotRating(int rating);

}
