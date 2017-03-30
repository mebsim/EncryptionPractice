# A quick and messy method of dealing with a ceasar encryption.
letters = ["A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"]
original = input("What is the sentence? ")
original = original.upper()
originalList = list(original)
rotations = int(input("How many rotations? "))
for i in range(0,len(original)):
    for j in range(0,len(letters)):
        if originalList[i] == letters[j]:
            originalList[i] = letters[(j+rotations)%26]
            break
for i in range(0,len(originalList)):
    print(originalList[i], end="")
