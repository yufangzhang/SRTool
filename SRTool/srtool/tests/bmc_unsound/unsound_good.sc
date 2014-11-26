void main()
{
	int start;
	assume(start > 0);
	int i;
	i=start;
	while(i)
	bound(2)
	{
		i = i - 1;
	}
	
	// this assert failure should be missed -- bound too small
	
	if(start > 2)
	{
		assert(0);
	}
}

