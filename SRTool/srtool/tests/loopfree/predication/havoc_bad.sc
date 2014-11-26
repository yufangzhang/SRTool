
void main(int a)
{
	a = 2;
	
	// should get new SSA index
	havoc(a);
	
	assert(a != 2);
	
}