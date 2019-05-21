package org.jfg.drills.function.cuadratic;

public class TestNumberOfOperationsInNestedLoops {

    // simulate that the number of operations decrease with each nested loop

    private int iterationsForLoop1 = 1;
    private int iterationsForLoop2 = 1;
    private int iterationsForLoop3 =1;
    private int iterationsForLoop4 = 1;
    private int iterationsForLoop5 = 1;

    public TestNumberOfOperationsInNestedLoops(){
    }

    public int calculateOperations(int it1, int it2, int it3, int it4, int it5) {

        int totalOperations = 0;
        for ( int i= 0; i < it1; i++) {

            System.out.println("Loop1-Op1");
            totalOperations++;

            for (int j = 0; j < it2; j++) {

                System.out.println("Loop2-Op1");
                System.out.println("Loop2-Op2");
                totalOperations +=2;


                for (int k = 0; k < it3; k++) {

                    System.out.println("Loop3-Op1");
                    System.out.println("Loop3-Op2");
                    System.out.println("Loop3-Op3");
                    totalOperations +=3;

                    for (int l = 0; l < it4; l++) {

                        System.out.println("Loop4-Op1");
                        System.out.println("Loop4-Op2");
                        System.out.println("Loop4-Op3");
                        System.out.println("Loop4-Op4");
                        totalOperations +=4;


                        for (int m = 0; m < it5; m++) {

                            System.out.println("Loop5-Op1");
                            System.out.println("Loop5-Op2");
                            System.out.println("Loop5-Op3");
                            System.out.println("Loop5-Op4");
                            System.out.println("Loop5-Op5");
                            totalOperations +=5;
                        }
                    }
                }
            }
        }

        return totalOperations;
    }

    public static void main(String[] args) {

        TestNumberOfOperationsInNestedLoops test = new TestNumberOfOperationsInNestedLoops();

        System.out.println(test.calculateOperations(2,2,2,2,2));
    }
}
