public class makechocolate{
public int makeChocolate(int small,int big,int goal){
        if(small>=goal-(big*5)&&goal-(big*5)>0){
        return goal-(big*5);
        }else if(goal%5==0&&big>=Math.floor(goal/5)){
        return 0;
        }else if(Math.floor(goal/5)<big &&small>=goal%5){
        return goal%5;
        }
        return-1;
        }

public static void main(String args[])

        {
        makechocolate make= new makechocolate();
                    System.out.println(make.makeChocolate(4,1,4));
        }
        }

