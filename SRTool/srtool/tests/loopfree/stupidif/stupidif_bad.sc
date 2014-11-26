
// This "test" is an example for the srt.ast.visitor.impl.StupidVisitor


void main(int c, int d)
{
	int z;
	
	z=0;
	
	if(c)
	{
		z=1;
		if(d)
		{
			z=2;
		}
		else
		{
			z=3;
		}
		z=4;
	}
	else
	{
		z=5;
		if(d)
		{
			z=6;
		}
		else
		{
			z=7;
		}
		z=8;
	}
	
	z=9;
	
	assert(0);
	
}