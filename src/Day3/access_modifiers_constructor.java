package Day3;

public class access_modifiers_constructor {

        private String name;
        private double salary;

        public access_modifiers_constructor() {
            name = "Unknown";
            salary = 10000.0;
        }

        public access_modifiers_constructor(String employeeName) {
            name = employeeName;
            salary = 10000.0;
        }

        public access_modifiers_constructor(String employeeName, double initialSalary) {
            name = employeeName;
            salary = initialSalary;
        }

        // Instead of display_Employee_info(), we use standard toString()
        @Override
        public String toString() {
            return "Name: " + name + "\nRS." + salary + "/-";
        }

        public static void main(String[] args) {
            access_modifiers_constructor emp1 = new access_modifiers_constructor();
            access_modifiers_constructor emp3 = new access_modifiers_constructor("Alice", 15000.0);

            // Now you can print the object DIRECTLY! Java calls toString() automatically.
            System.out.println(emp1);
            System.out.println("----------------");
            System.out.println(emp3);
        }
    }

