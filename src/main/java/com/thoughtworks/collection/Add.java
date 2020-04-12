package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Add {
    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int sumOfProcessedOdds = 0 ;
        for (int i = 0; i<arrayList.size();i++) {
            if (arrayList.get(i) % 2 == 1) {
                sumOfProcessedOdds += arrayList.get(i) * 3 + 5;
            }
        }
        return sumOfProcessedOdds;
        //throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> oddListDesc = arrayList.stream().filter(element -> element % 2 != 0).
                sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<Integer> evenListAsc = arrayList.stream().filter(element -> element % 2 == 0).
                sorted().collect(Collectors.toList());
        List<Integer> resultList = new ArrayList<Integer>();
        resultList.addAll(evenListAsc);
        resultList.addAll(oddListDesc);
        return resultList;
    }


    public boolean isIncludedInEven(List<Integer> arrayList, Integer specialElement) {
        List<Integer> evenList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                evenList.add(arrayList.get(i));
            }
        }
            if (evenList.contains(specialElement)) {
                return true;
            }
            return false;


    }

        public List<Integer> getTripleOfOddAndAddTwo (List < Integer > arrayList) {
            List <Integer> sumTripleOfOddAddTwoList = new ArrayList<>();
            for (int i = 0; i<arrayList.size();i++){
                if(arrayList.get(i) % 2 == 1) {
                    sumTripleOfOddAddTwoList.add(arrayList.get(i) * 3 + 2);
                }
                else{
                    sumTripleOfOddAddTwoList.add(arrayList.get(i));
                }
            }
            return sumTripleOfOddAddTwoList;

        }

        public int getSumTripleAndAddTwo (List < Integer > arrayList) {
            int sumTripleAndAddTwo = 0;
            for (int i = 0; i<arrayList.size();i++){
                sumTripleAndAddTwo += arrayList.get(i) * 3 + 2;
            }
            return  sumTripleAndAddTwo;
        }

        public int getSumOfEvens ( int leftBorder, int rightBorder){
            int sumOfEvens = 0;
            ArrayList<Integer> evenNumberList = new ArrayList<>();
            if (leftBorder < rightBorder) {
                for (int i = leftBorder; i <= rightBorder; i++) {
                    if (i % 2 == 0) {
                        evenNumberList.add(i);
                    }
                }
                for (int j = 0; j < evenNumberList.size(); j++) {
                    sumOfEvens += evenNumberList.get(j);
                }
            }
            else if (rightBorder < leftBorder){
                for (int i = rightBorder; i <= leftBorder; i++) {
                    if (i % 2 == 0) {
                        evenNumberList.add(i);
                    }
                }
                for (int j = 0; j < evenNumberList.size(); j++) {
                    sumOfEvens += evenNumberList.get(j);

                }
            }

            return sumOfEvens;
        }



        public int getSumOfOdds ( int leftBorder, int rightBorder){
            int sumOfOdds = 0;
            ArrayList<Integer> oddNumberList = new ArrayList<>();
            if (leftBorder < rightBorder) {
                for (int i = leftBorder; i <= rightBorder; i++) {
                    if (i % 2 == 1) {
                        oddNumberList.add(i);
                    }
                }
                for (int j = 0; j < oddNumberList.size(); j++) {
                    sumOfOdds += oddNumberList.get(j);

                }
            }
            else if (rightBorder < leftBorder){
                for (int i = rightBorder; i <= leftBorder; i++) {
                    if (i % 2 == 1) {
                        oddNumberList.add(i);
                    }
                }
                for (int j = 0; j < oddNumberList.size(); j++) {
                    sumOfOdds += oddNumberList.get(j);

                }
            }

            return sumOfOdds;
        }

    }

