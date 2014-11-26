
void main()
{

  int i;

  i = 200;

  while(i >= 100)
  {
    i = i - 2;
    assert(i > 0);
  }
  assert(i == 98);

}

