package Buckets;

import java.util.Scanner;
class calculate{
	static int getBucketCount(double a,double b,double c) 
	{
		if(a<=0||b<=0||c<=0) 
		{
			return -1;
		}
		int bucket=(int) Math.ceil((a*b)/c);
		return bucket;
	}
	static int getBucketCount(double a,double b) 
	{
		if(a<=0||b<=0) 
		{
			return -1;
		}
		int bucket= (int)Math.ceil((a/b));
		return bucket;
	}
}
public class BucketCount {
	public static void main(String[] args) { 
		double width,heigth,bucketArea,wallArea;
		int out;
		int n;
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter 1 if you know the value of width and heigth otherwise enter 2: ");
		n=sc.nextInt();
		if(n==1)
		{
			System.out.print("Enter the width of wall: ");
			width=sc.nextDouble();
			System.out.print("Enter the height of wall: ");
			heigth=sc.nextDouble();
			System.out.print("Enter the area Per Bucket: ");
			bucketArea=sc.nextDouble();
			calculate ob =new calculate();
			out=ob.getBucketCount(width,heigth,bucketArea);
			System.out.println((out));
		}
		else if(n==2)
		{
			System.out.print("Enter the area of wall: ");
			wallArea=sc.nextDouble();
			System.out.print("Enter the aarea Per Bucket: ");
			bucketArea=sc.nextDouble();
			calculate ob=new calculate();
			out=ob.getBucketCount(wallArea,bucketArea);
			System.out.println((out));
		}
		else{
			System.out.println("wrong input");
			
		}		
	}
}
