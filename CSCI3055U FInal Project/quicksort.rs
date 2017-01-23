
type OrderFunc<T> = Fn(&T, &T) -> bool;

fn main() {
   

    let mut strings = ["Bob", "Cat", "Dog", "Freind"];
    println!("Before: {:?}", strings);

    quick_sort(&mut strings, &lessthan);
    println!("After sorted {:?}", strings);
 
 
}


fn lessthan<T: Ord>(x: &T, y: &T) -> bool {
    x < y
}

fn quick_sort<T>(v: &mut [T], f: &OrderFunc<T>) {
 
    let len = v.len();
    if len < 2 {
        return;
    }
 
    let index = partition(v, f);
 
    
    quick_sort(&mut v[0..index], f);
 
 
    quick_sort(&mut v[index + 1..len], f);
}
 
fn partition<T>(v: &mut [T], f: &OrderFunc<T>) -> usize {
    let len = v.len();
    let index = len / 2;
 
    v.swap(index, len - 1);
 
    let mut store = 0;
    for i in 0..len - 1 {
        if f(&v[i], &v[len - 1]) {
            v.swap(i, store);
            store += 1;
        }
    }
 
    v.swap(store, len - 1);
    store
}
