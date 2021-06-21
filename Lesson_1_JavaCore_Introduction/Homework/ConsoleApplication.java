package Lesson_1_JavaCore_Introduction.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleApplication {
    /*
     1) Flower bed is shaped like a circle. Calculate the perimeter and area by entering the
     radius. Output obtained results.
     2) Define String variables name and address. Output question "What is your name?"
     Read the value  name and output next question: “Where are you live, (name)?". Read
     address and write whole information.
     3) Phone calls from three different countries are с1, с2 and с3 standard units per
     minute. Talks continued t1, t2 and t3 minutes. How much computer will count for
     each call separately and all talk together? Input all source data from console, make
     calculations and output to the screen.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("If you need to know the area of the circle and circle perimeter," +
                " enter the radius:\n");
        double radius = Double.parseDouble(br.readLine());
        System.out.printf("Area of circle %.2f\nCircle perimeter %.2f\n",
        CircleFormulas.areaOfCircle(radius),CircleFormulas.circlePerimeter(radius));

        System.out.println("Enter: what is your name?");
        String myName = br.readLine();
        System.out.println("Enter: where are you live?");
        String myLive = br.readLine();
        ContactInformation ci = new ContactInformation(myName,myLive);
        System.out.println(ci.myNameMyAddres());

        System.out.println("Enter: the standard units of the firs call");
        Double standartUnitFirsCalll = Double.parseDouble(br.readLine());
        System.out.println("Enter: the standard unit of the second call");
        Double standartUnitSecondCall = Double.parseDouble(br.readLine());
        System.out.println("Enter: the standard unit of the third call");
        Double standartUnitThirdCall = Double.parseDouble(br.readLine());
        System.out.println("Enter: the talk time of the of the fist call");
        Double timeFirstCall = Double.parseDouble(br.readLine());
        System.out.println("Enter: the talk time of the of the second call");
        Double timeSecondCall = Double.parseDouble(br.readLine());
        System.out.println("Enter: the talk time of the of the third call");
        Double timeThirdCall = Double.parseDouble(br.readLine());
        PhoneCalls pc = new PhoneCalls(standartUnitFirsCalll, standartUnitSecondCall, standartUnitThirdCall,
                timeFirstCall,timeSecondCall, timeThirdCall);
        System.out.printf("The cost of the first call: %s\nThe cost of the second call: %s\n" +
                        "The cost of the third call: %s\nThe cost of all calls together: %s",
                pc.costFirstCall(),
                pc.costSecondCall(), pc.costThirdCall(),pc.sumOfCalls());
    }

    static class CircleFormulas {
        private double radius;

        public CircleFormulas(double radius) {
            this.radius = radius;
        }

        //<editor-fold desc="Getter&Setter">
        public double getRadius() {
            return radius;
        }
        //</editor-fold>

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public static double areaOfCircle(double radius) {
            double S;
            return S = Math.PI * Math.pow(radius,2);
        }

        public static double circlePerimeter(double radius) {
            double P;
            return P = 2 * Math.PI * radius;
        }
    }
    static class ContactInformation{
    private String myName;
    private String myLive;

        public ContactInformation(String myName) {
            this.myName = myName;
        }

        public ContactInformation(String myName, String myLive) {
            this.myName = myName;
            this.myLive = myLive;
        }

        public String getMyName() {
            return myName;
        }

        public void setMyName(String myName) {
            this.myName = myName;
        }

        public String getMyLive() {
            return myLive;
        }

        public void setMyLive(String myLive) {
            this.myLive = myLive;
        }
        public String myNameMyAddres(){
            return "My name is " + getMyName() + ", I live in " + getMyLive();
        }
    }
    static class PhoneCalls{
       private double c1, c2, c3, t1,t2,t3;

        //<editor-fold desc="Constructors">
        public PhoneCalls(double c1) {
            this.c1 = c1;
        }

        public PhoneCalls(double c1, double c2) {
            this.c1 = c1;
            this.c2 = c2;
        }

        public PhoneCalls(double c1, double c2, double c3) {
            this.c1 = c1;
            this.c2 = c2;
            this.c3 = c3;
        }

        public PhoneCalls(double c1, double c2, double c3, double t1) {
            this.c1 = c1;
            this.c2 = c2;
            this.c3 = c3;
            this.t1 = t1;
        }

        public PhoneCalls(double c1, double c2, double c3, double t1, double t2) {
            this.c1 = c1;
            this.c2 = c2;
            this.c3 = c3;
            this.t1 = t1;
            this.t2 = t2;
        }

        public PhoneCalls(double c1, double c2, double c3, double t1, double t2, double t3) {
            this.c1 = c1;
            this.c2 = c2;
            this.c3 = c3;
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
        }
        //</editor-fold>

        //<editor-fold desc="Getter&Setter">
        public double getC1() {
            return c1;
        }

        public void setC1(double c1) {
            this.c1 = c1;
        }

        public double getC2() {
            return c2;
        }

        public void setC2(double c2) {
            this.c2 = c2;
        }

        public double getC3() {
            return c3;
        }

        public void setC3(double c3) {
            this.c3 = c3;
        }

        public double getT1() {
            return t1;
        }

        public void setT1(double t1) {
            this.t1 = t1;
        }

        public double getT2() {
            return t2;
        }

        public void setT2(double t2) {
            this.t2 = t2;
        }

        public double getT3() {
            return t3;
        }

        public void setT3(double t3) {
            this.t3 = t3;
        }
        //</editor-fold>

        public String costFirstCall(){
            return Double.toString(getT1() * getT1());
        }

        public String costSecondCall(){
            return  Double.toString(getC2() * getT2());
        }
        public  String costThirdCall(){
           return  Double.toString(getC3() * getT3());
        }
        public String sumOfCalls(){
         return Double.toString(Double.parseDouble(costFirstCall()) +
                 Double.parseDouble(costSecondCall()) + Double.parseDouble(costThirdCall()));
        }
    }
}

