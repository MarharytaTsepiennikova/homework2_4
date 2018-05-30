package Task1;

class Human implements Comparable{

    private int age;

    Human(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Object another) {
        Human human = (Human) another;
        if (age < human.age) {
            return -1;
        }
        else if (age == human.age) {
            return 0;
        }
        else if (age > human.age) {
            return 1;
        }
        else{
            return 0;
        }
    }
}
