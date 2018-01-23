package com.munis.calcenginelambda;

/**
 * Created by MN883H on 1/22/2018.
 */
public class ExampleFP {

    final static double[] EXPECTED_SALES_JAN_TO_DEC = new double[]{
            42.0, 45.6, 43.6, 50.2, 55.6, 54.7,
            58.0, 57.3, 62.0, 60.3, 71.2, 88.8
    };
    public static void main(String[] args){

//        final FunctionOverTime sales = time -> EXPECTED_SALES_JAN_TO_DEC[time - 1];
//        final FunctionOverTime fixedCosts = time -> 0.15;
//        final FunctionOverTime incrementalCosts = time -> (5.1 + 0.15) * time;
//        final FunctionOverTime profit = time -> sales.valueAt(time) - (fixedCosts.valueAt(time) + incrementalCosts.valueAt(time ));


//        final FunctionOverTime sales = FunctionOverTime.monthByMonth(EXPECTED_SALES_JAN_TO_DEC);
//        final FunctionOverTime fixedCosts = FunctionOverTime.constant(15.0);
//        final FunctionOverTime incrementalCosts = FunctionOverTime.line(5.1,0.15);
//        final FunctionOverTime profit = FunctionOverTime.combinationOf3(
//                sales, incrementalCosts, fixedCosts, (s,ic,fc) -> s - ic - fc
//        );

        final Sales sales = new Sales(FunctionOverTime.monthByMonth(EXPECTED_SALES_JAN_TO_DEC));
        final FixedCosts fixedCosts = new FixedCosts(FunctionOverTime.constant(15.0));
        final IncrementalCosts incrementalCosts = new IncrementalCosts(FunctionOverTime.line(5.1,0.15));

        final Profit profit = new Profit(sales,incrementalCosts,fixedCosts);

        double totalProfit = 0.0;
        for(int time=1; time<=12;time++){
            totalProfit += profit.valueAt(time);
        }

        System.out.println("Total profits for the year " + totalProfit);
    }
}
