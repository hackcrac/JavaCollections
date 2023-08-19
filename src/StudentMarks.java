public class StudentMarks implements Comparable<StudentMarks> {
    private int maths;
    private int physics;

    StudentMarks(int maths, int physics){
        this.maths = maths;
        this.physics = physics;
    }

    int getMaths(){
        return maths;
    }

    int getPhysics(){
        return physics;
    }

    @Override
    public String toString(){
        return "[ Maths -> " + maths + ", Physics -> "+ physics+" ]";
    }

    @Override
    public int compareTo (StudentMarks sm){
        return sm.maths - this.maths;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        // it checks if the argument is of the
        // type Geek by comparing the classes
        // of the passed argument and this object.
        // if(!(obj instanceof Geek)) return false; ---> avoid.
        if(obj == null || obj.getClass()!= this.getClass()) return false;
        StudentMarks s = (StudentMarks) obj;
        return (this.maths == s.maths && this.physics == s.physics);
    }

    @Override
    public int hashCode(){
        final int pno = 31;
        int result = 1;
        result = pno * result + maths;
        result = pno * result + physics;
        return result;
    }
}
