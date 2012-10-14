public class Pool {
	
	public Enum Type {
		LAP, LEISURE
	}

	private final Type poolType;
	private final float sqaureFeet;

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
