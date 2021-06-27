package scjp2;

/**
 * Describe class Horse here.
 *
 *
 * Created: Sat Apr  6 10:59:56 2019
 *
 * @author <a href="mailto:root@zink">root</a>
 * @version 1.0
 */
 class Horse extends Animal{

    Horse(){

    }

    /**
     * Describe <code>sound</code> method here.
     *
     */
    public String sound() {
	return "horse sound";
    }    

    /**
     * Describe <code>animalSound</code> method here.
     *
     * @return a <code>String</code> value
     */
    public String animalSound() {
	return super.sound();
    }    

    /**
     * Describe <code>finalize</code> method here.
     *
     */
     @Override
     public void finalize(){
	System.out.println("deprecated from java9, read the documentation c-c c-v c-w");
    }

}
