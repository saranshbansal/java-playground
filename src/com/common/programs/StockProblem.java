package com.common.programs;

import java.util.ArrayList;
import java.util.List;

public class StockProblem
{

    class Pair
    {
        int buyIndx, sellIndx;


        @Override
        public String toString()
        {
            return "Pair [buyIndx=" + buyIndx + ", sellIndx=" + sellIndx + "]";
        }

    }


    public static void main(String[] args)
    {
        StockProblem st = new StockProblem();
        int inputArr[] = {100, 180, 260, 310, 40, 535, 695};
        st.findMaxProfitPairs(inputArr, inputArr.length);
    }


    private void findMaxProfitPairs(int[] ar, int n)
    {
        // TODO Auto-generated method stub
        // You will buy on Day 0 and sell on Day 3
        // You will buy again on Day 4 and sell on Day 6
        List<Pair> list = new ArrayList<>();

        for (int i = 0; i < n - 1; i++)
        {
            Pair pair = new Pair();

            // find buy index
            if (i < n - 1 && ar[i + 1] <= ar[i])
            {
                i++;
            }
            System.out.println("buy index: " + i);
            pair.buyIndx = i;

            // find sell index
            if (i < n - 1 && ar[i + 1] >= ar[i])
            {
                i++;
            }
            System.out.println("sell index: " + i);
            pair.sellIndx = i;

            // add pair
            if (pair.buyIndx < pair.sellIndx)
            {
                list.add(pair);
            }
        }
        System.out.println("Pairs: " + list);

    }
}
