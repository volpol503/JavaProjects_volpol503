package Test.hh2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static Long min(List<Long> list,Long minValue){
        Long min=Long.MAX_VALUE;
        for(Long i:list){
            if((i>=minValue)&&(i<min)){
                min=i;
            }
        }

        return min;
    }
    public static Long max(List<Long> list,Long maxValue){
        Long max=Long.MIN_VALUE;
        for(Long i:list){
            if((i<=maxValue)&&(i>max)){
                max=i;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count=0;
        try {
            count=Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Long> time1=new ArrayList<>();
        List<Long> time2=new ArrayList<>();
        Long t1= Long.valueOf(0),t2= Long.valueOf(0),stat=Long.valueOf(0);

        for(int i=0;i<count;i++){

            try {
                String str=reader.readLine();
                time1.add(Long.parseLong(str.split(" ")[0]));
                time2.add(Long.parseLong(str.split(" ")[1]));
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        List<Long> result1=new ArrayList<>();
        List<Long> result2=new ArrayList<>();
        while(true){
            t1=min(time1,stat);
            t2=min(time2,t1);
            t1=max(time1,t2);
            stat=t2;
            result1.add(t1);
            result2.add(t2);
            if(t1.equals(t2))
                stat++;
            if(min(time1,stat).equals(Long.MAX_VALUE)){
                break;
            }

        }
        Long size=Long.valueOf(0);
        for(int i=0;i<result1.size();i++){
            size=size+result2.get(i)-result1.get(i)+1;
        }
        if(count!=0)
            System.out.println(result1.size()+" "+size);
        else
            System.out.println(0+ " "+0);
    }
}