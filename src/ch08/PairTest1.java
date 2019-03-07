package ch08;


import java.time.LocalDate;
@SuppressWarnings("all")

class Pair1<T> {
    private T second;

    public void setSecond(T newValue) {
        // second = newValue;
        Pair<String> a = new Pair<>();
        Pair<Integer> b = new Pair<>();
        if (a instanceof Pair) { //error: instanceof Pair<String>

        }
        a = (Pair) b; //error: (Pair<Interger)b;

        System.out.println(a.getClass() == b.getClass());
    }

    static class DateInterval extends Pair1<LocalDate> {
        @Override
        public void setSecond(LocalDate newValue) {
            @SuppressWarnings("all")
            int i = 1;
            super.setSecond(newValue);
        }


        public static void main(String[] args) {
            class Employee {
            }

            Pair<Employee> e = new Pair<>();
            Employee emp = e.getFirst();
        }
    }
}
