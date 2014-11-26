
void main()
{

  int i;
  int j;

  i = j;

  while(i < 100)
    cand(i != j)
    cand((i - j) == 0)
    cand((i + j) > 0)
    cand((i == i + i + j - j - i))
  {
    i = i + 1;
    j = j + 1;
  }
  assert(i == j);

}

