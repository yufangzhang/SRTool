

void main()
{
 int i;
 int iterations;
 i=0;
 
 // make iterations positive, but otherwise unconstrained
 assume(iterations > 0);
 
 while(i < iterations)
  cand(i <= iterations)
  cand(i == 74)
  cand(i != -1)
 {
  i = i + 1;
 }
 
 assert(i == iterations);
 
}

