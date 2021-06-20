package Task2;

public class ConsoleApplication {
    public static void main(String[] args) {

    }
    static class Employee {
        // в полях класу 3 приватних поля name, rate, hours
        private  String name;
        private float rate;
        private float hours;
        // і одне стати приватне поле totalSum
        private static float totalSum;
        Employee (String name){
            this.name = name;
        }
        Employee(String name, float rate){
            this.name = name;
            this.rate = rate;
        }
        Employee(String name, float rate, float hours){
            this.name = name;
            this.rate = rate;
        }
        //створюємо гетери і сеттери
        public String getName() {return name;}
        public void setName(String name) {
            this.name = name;
        }
        public float getRate() {return rate;}
        public void setRate(float rate) {
            this.rate = rate;
        }
        public float getHours() {return hours;}
        public void setHours(int hours) {this.hours = hours;}
        // створення методів
        public float getSalary(){
            return totalSum = getRate() + getHours();
        }
        public String toString(){
            return getName();
        }
        public  int changeRate(int rate){
            return (int) (totalSum = rate);
        }
        public  float getBonuses(){
            return totalSum = (float) (getSalary() * 0.1);
        }
    }
}
