package fr.uga.projet1.defaultItf;

public interface Comparer<T> extends Comparable<T>   {
	
	default boolean isIdentique(T obj){
		return this.compareTo(obj)==0; 
		
	}
	
	default boolean plusGrandQue(T obj){
		return this.compareTo(obj)>0; 
	}
	
	default boolean plusPetitQue(T obj){
		return this.compareTo(obj)<0; 
		
	}
	

}
