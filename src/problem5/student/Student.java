/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;

import java.util.Scanner;

// to store student information and properties
public class Student {
    private String name;
    private int rollno, backlog, apperingcount;
    private Scanner sc;
    public Student() {
        sc = new Scanner(System.in);
        System.out.print("Name :");
        this.name = sc.next();
        System.out.print("Roll.no : ");
        this.rollno = sc.nextInt();
        System.out.print("Backlog_count : ");
        this.backlog = sc.nextInt();
        System.out.print("appering_count");
        this.apperingcount = sc.nextInt();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", rollno=" + rollno +
                ", backlog=" + backlog +
                ", apperingcount=" + apperingcount
                ;
    }

    public int getBacklog() {
        return backlog;
    }

    public void setBacklog(int backlog) {
        this.backlog = backlog;
    }

    public int getApperingcount() {
        return apperingcount;
    }

    public void setApperingcount(int apperingcount) {
        this.apperingcount = apperingcount;
    }

}
