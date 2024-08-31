use std::collections::HashMap;
use std::io::{self, BufRead};

fn main() {
    let stdin = io::stdin();
    let reader = stdin.lock();
    let mut lines = reader.lines();

    let first_line = lines.next().unwrap().unwrap();
    let mut nums = first_line.split_whitespace();
    let n: usize = nums.next().unwrap().parse().unwrap();
    let m: usize = nums.next().unwrap().parse().unwrap();

    let mut v = Vec::new();
    for _ in 0..n {
        let str = lines.next().unwrap().unwrap();
        v.push(str);
    }

    let k: usize = lines.next().unwrap().unwrap().parse().unwrap();
    
    let mut table = HashMap::new();

    for i in &v {
        let zero_count = i.chars().filter(|&j| j == '0').count();

        if zero_count > k || (zero_count % 2 != k % 2) {
            continue;
        }

        *table.entry(i.clone()).or_insert(0) += 1;
    }

    let ans = table.values().max().unwrap_or(&0);
    println!("{}", ans);
}
