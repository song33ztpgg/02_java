package shoes;

import java.util.List;

import shoe.Shoe;

public interface ShoeShowcase {

	public abstract int  add(Shoe shoe);
	public abstract int  set(Shoe shoe);
	public abstract int  remove(Shoe shoe);
	public abstract Shoe get(Shoe shoe);
	public abstract List<Shoe>  getAllShoes();
	
}

//==========================================================================================
//package : shoes
//Interface : ShoeShowcase(신발진열장을 의미하는 인터페이스)
//---------------------------------------------
//인터페이스 추상메소드 영역
//+ add(Shoe shoe) : int
//+ set(Shoe shoe) : int
//+ remove(Shoe shoe) : int
//+ get(Shoe shoe) : Shoe 
//+ getAllShoes()  : List<Shoe>
//