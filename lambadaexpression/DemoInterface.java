
	package lambadaexpression;
	@FunctionalInterface
	public interface DemoInterface 
	{
		void test();
		default void test1()
		{
			System.out.println("hello");
		}
		static void test2()
		{
			System.out.println("world");
		}

	}


