package com.company;
import java.util.*;
// dragon problem codeforces
public class Main
{
        public static void main(String[] args)
        {
            Scanner s=new Scanner(System.in);
            int k=s.nextInt();
            int l=s.nextInt();
            int m=s.nextInt();
            int n=s.nextInt();
            int d=s.nextInt();

            int c=0;
            for(int i=1;i<=d;i++)
            {
                if(i%k==0 || i%l==0 || i%m==0 || i%n==0)
                {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
