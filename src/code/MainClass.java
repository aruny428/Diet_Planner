package code;

import java.text.DecimalFormat;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int profileSelection=0;
		DecimalFormat df=new DecimalFormat(".##");
		while(profileSelection!=3)
		{
			System.out.println("Please select your Profile : ");
			System.out.println("1: Student");
			System.out.println("2: professional");
			System.out.println("3: Exit");
			profileSelection=sc.nextInt();
			
	
			switch(profileSelection) {
		
				case 1:
					System.out.println("Enter your Budget in Rupees:");
					double budget=sc.nextDouble();
					Student st=new Student(budget);
					System.out.println("Enter your Weight kgs :");
					st.weight=sc.nextDouble();
					System.out.println("Enter your Height in meter :");
					st.height=sc.nextDouble();
				
					System.out.println("Your BMI is :"+ df.format(st.bmi(st.weight, st.height)));
				
					if(st.bmi()<18.5)
					{
						System.out.println("Your are under weight. You should follow this deit plan:");
						if(st.budget<200)
						{
							UnderWeightL ub=new UnderWeightL();
						}
						else {
							UnderWeight ub=new UnderWeight();
						}
					}
					else if(st.bmi()>30)
					{
						System.out.println("you are over weight. you should follow this diet plan:");
						OverWeight ob=new OverWeight();
					}
					else
					{
						System.out.println("you are normal. Enjoy !");
					}
					break;
				
				case 2:
				
					System.out.println("Enter How many hours you work :");
					int time=sc.nextInt();
					Professional p=new Professional(time);
					System.out.println("Enter your Weight kgs :");
					p.weight=sc.nextDouble();
					System.out.println("Enter your Height in meter :");
					p.height=sc.nextDouble();
					
					
					System.out.println("Your BMI is :"+ df.format(p.bmi(p.weight, p.height)));
					
					if(p.bmi()<18.5)
					{
						System.out.println("Your are under weight. You should follow this diet plan:");
						UnderWeight ub=new UnderWeight();
					}
					else if(p.bmi()>30)
					{
						System.out.println("you are over weight. you should follow this diet plan:");
						if(p.time<7)
						{
							OverWeight ob=new OverWeight();
						}
						else {
							OverweightL ob=new OverweightL();  //small w in Weight
						}
					}
					else
					{
						System.out.println("you are normal. Enjoy !");
					}
					
					break;
			}
			
			if(profileSelection>3)
			{
				System.out.println("please Enter a value between 1 to 3 !");
			}
			
			System.out.println();
		}
		if(profileSelection==3)
		{
			System.out.println("Thank you for using our services !");
		}
		sc.close();
	}

}
