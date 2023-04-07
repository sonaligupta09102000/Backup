package com.ChainResponsibility.DesignPattern;

public interface Chaintocall {
	
	public void setNextChain(Chaintocall nextChain);
	
	public void calculation(Numbers request);

}
