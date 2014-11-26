
void main()
{
	int i;
	i=0;
	// with default unwind depth of 5, unwinding assertion should not fail
	while(i < 5)
	{
	 i = i + 1;
	}
	
}

