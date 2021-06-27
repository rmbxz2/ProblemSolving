
package scjp.exam.stuff;

enum CoffeSizeOk {
    BIG(11), HUGE(11,22), OVERTHREE(11,22,33);

    private int first;
    private int second;
    private int third;
    
    CoffeSizeOk(int first){
	this.first=first;
    }

    CoffeSizeOk(int first,int second){
	this.first=first;
	this.second=second;
    }

    CoffeSizeOk(int first,int second,int third){
	this.first=first;
	this.second=second;
	this.third=third;
    }

    public int getFirst(){
	return first;
    }

    public int getSecond(){
	return second;
    }

    public int getThird(){
	return third;
    }
}
