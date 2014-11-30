void main(int i, int j, int p)
{
	i=64;
	j=3<<1;
	p = (i >> j+1);
	assert(p);
	assert(i<1);
	assert(j>2);
}
