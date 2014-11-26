void main()
{

  int i;

  i = 100;

  while(i < 200)
  {
    i = i + 1;
    assert(i > 0);
  }
  assert(i == 200);

}

