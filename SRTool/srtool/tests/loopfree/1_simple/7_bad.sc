void main(int i, int j, int k, int p)
{
	i=9*2/3;
	j=8%3;
	k=i^j;
	p = ((i&j)&  k);
	assert(p);
}
