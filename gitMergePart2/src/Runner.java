public class Runner {

	public static void main(String[] args) {
		Pool pool = new Pool(Pool.Type.LAP, 1200);
		HotTub tub = new HotTub(104, 12, 100);
		pool.cleanPool();
	}

}
