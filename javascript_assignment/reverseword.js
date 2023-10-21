function reverseWords(sentence) {
    // Split the sentence into words
    let words = sentence.split(" ");
    
    // Reverse each word
    for (let i = 0; i < words.length; i++) {
        words[i] = words[i].split('').reverse().join('');
    }
    
    // Join the reversed words back into a sentence
    let reversedSentence = words.join(" ");
    
    return reversedSentence;
}

// Example usage
let input = "Hi this is ramya";
let reversed = reverseWords(input);
console.log(reversed);
