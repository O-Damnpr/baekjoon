use std::io;

fn fibonacci(n : i32) {
	let mut a: i64 = 1;
	let mut b: i64 = 1;
	let mut c: i64 = 0;
    
	for _ in 2..n {
		c = a + b;
		a = b;
		b = c;
	}
    
	println!("{}", c);
}
fn main() {
	let mut input = String::new();
    
	io::stdin().read_line(&mut input)
		.expect("error");
    
	let n : i32 = input.trim().parse()
		.expect("error");

	match n {
		1 => println!("1"),
		2 => println!("1"),
		_ => fibonacci(n),
	}
}