void main(int i, int j, int k, int p, int q)
{
	i=9-1;
	j=8;
	k=1;
	p = ((i >= j)&&(j<=k));
	q = (i>j)||(j<k);
	assert(p);
}
