package com.example.ham.myapplication;


/**
this java class use to check the slove is true or not
 */

public class Checker{

    int[][] sMatrix;
    static int rSum=0;
    static int cSum=0;

    static int[] rSumArray=new int[9];

    static int[] cSumArray=new int[9];

    static int[] boxSumArray=new int[9];
    public Checker(int[][] a){
        this.sMatrix=a;

    }
    static boolean checkArrayStatus(int[] rSumArray,int[] cSumArray,int[] boxSumArray)
    {
        int i=0;

        boolean sudukoStatus=true;

        while(i<9){
            if(rSumArray[i]!=45&&cSumArray[i]!=45&&rSumArray[i]!=45)
            {
                sudukoStatus=false;
                break;
            }
            i++;
        }
        return sudukoStatus;
    }
    public int check(){
        for(int i=0 ; i<sMatrix.length ; i++){
            for(int j=0 ; j<sMatrix.length ; j++){
                rSum+=sMatrix[i][j];
                cSum+=sMatrix[j][i];
            }
            rSumArray[i]=rSum;
            cSumArray[i]=cSum;
            rSum=0;
            cSum=0;
        }

        for(int i=0 ; i< sMatrix.length ; i++){
            for(int j=0 ; j<sMatrix.length ; j++){
                if(i<=2&&j<=2)
                {
                    boxSumArray[0]+=sMatrix[i][j];
                }
                if(i<=2&&(j>=3&&j<=5))
                {
                    boxSumArray[1]+=sMatrix[i][j];
                }
                if(i<=2&&(j>=6&&j<=8))
                {
                    boxSumArray[2]+=sMatrix[i][j];
                }
                if((i>=3&&i<=5)&&(j<=2))
                {
                    boxSumArray[3]+=sMatrix[i][j];
                }
                if((i>=3&&i<=5)&&(j>=3&&j<=5))
                {
                    boxSumArray[4]+=sMatrix[i][j];
                }
                if((i>=3&&i<=5)&&(j>=6&&j<=8))
                {
                    boxSumArray[5]+=sMatrix[i][j];

                }
                if((i>=6)&&(j<=2))
                {
                    boxSumArray[6]+=sMatrix[i][j];
                }
                if((i>=6)&&(j>=3&&j<=5))
                {
                    boxSumArray[7]+=sMatrix[i][j];
                }
                if((i>=6)&&(j>=6))
                {
                    boxSumArray[8]+=sMatrix[i][j];
                }
            }
        }

        if(checkArrayStatus(rSumArray,cSumArray,boxSumArray))
        {
            return 1;        }
        else
        {
            return 0;        }
    }
}