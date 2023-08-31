package com.systechafrica.arrays;

import java.util.logging.Logger;

import com.systechafrica.stringandstringbuilder.StringClassDemo;

public class WorkingWithArrays {
    private static final Logger LOGGER= Logger.getLogger(WorkingWithArrays.class.getName());
    public void singleDimensionalArray(){
        int[] numbers={0,1,2,3,4,5};
        String[] nickNames={"Jimi","Jaymoh","james","Maina"};
        //for (int i=0;i<numbers.length;i++){
            //LOGGER.info(""+numbers[i]);

        //}
        LOGGER.info(nickNames[0]);
        LOGGER.info(nickNames[1]);
        LOGGER.info(nickNames[2]);


        


    }
    
    public void multiDimensionalArray(){
        int[][] matrix={{1,2,3}, {4,5,6}, {7,8,9}};

        int length=matrix.length;
        LOGGER.info("Length of multi Dimentional array " + length);
        LOGGER.info("Number 8" + matrix[2][1]);

         int[][] matrix2=new int[3][];//multidimentional array of length 3
         matrix2[0][0]=10;
         matrix2[0][1]=10;
         matrix2[1][2]=10;
         

         for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j]);
                
            }
             System.out.println();
            
         }

    }
    
public static void main(String[] args) {
    WorkingWithArrays app=new WorkingWithArrays();
    //app.singleDimensionalArray();
    app.multiDimensionalArray();

    
}
    
}
