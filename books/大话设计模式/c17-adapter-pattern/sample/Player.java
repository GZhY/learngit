/*
 * @Author: GZhY 
 * @Date: 2016-11-18 14:46:27 
 * @Last Modified by: GZhY
 * @Last Modified time: 2016-11-18 20:27:15
 */
abstract class Player{
	
	protected String name;

	public Player(String name){
		this.name = name;
	}

	public abstract void attack();
}