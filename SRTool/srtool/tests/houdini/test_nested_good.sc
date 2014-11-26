void main()
{

  int i;
  int j;
  int k;
  int l;

  i = j;

  while(i < 100)
    cand(i != j)
    cand((i - j) == 0)
    cand((i + j) > 0)
    cand((i == i + i + j - j - i))
  {
    i = i + 1;
    j = j + 1;
    k = 0;
    l = 0;
    while(k < 200)
      cand(k != l)
      cand(k == l)
      cand(i == k)
      cand(j == k)
    {
      k = k + 1;
      l = l + 1;
    }
    i = i + k;
    j = j + l;
  }
  assert(i == j);

}

