import java.util.Date;

import com.sun.org.apache.bcel.internal.generic.Type;

public class Pool {
	
	public enum Type {
		LAP, LEISURE;
	}

	private final Type poolType;
	private final float squareFeet;

	private Date lastCleaned;

	public Pool(Type poolType, float squareFeet) {
		this.poolType = poolType;
		this.squareFeet = squareFeet;
		lastCleaned = new Date();
	}

	public void cleanPool() {
		lastCleaned = new Date();
	}

	public int capacity() {
		return (int)(squareFeet / (3 * 3));
	}

	public float getSquareFeet() {
		return squareFeet;
	}

	public Type getPoolType() {
		return poolType;
	}

}
