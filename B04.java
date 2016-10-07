package gitbash;
import java.util.*;
public class test {
  int money = 0;  int so = 0;  Scanner sc = new Scanner(System.in);  System.out.print("연봉을 원단위로 입력하세요");    money = sc.nextInt();    if (money >= 80000000)    so = (int)(money * 0.37);  else if(money >=40000000)      so=(int)(money *0.28);  else if(money >=10000000)      so=(int)(money *0.19);  else      so=(int)(money *0.095);    System.out.println("연봉 금액에 대한 소득세는 "+so+"입니다.");     }}
