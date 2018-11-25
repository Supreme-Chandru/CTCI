/**
 * 10.3 Search in Rotated Array: Given a sorted array of n integers that has been rotated an unknown
 * number of times, write code to find an element in the array. You may assume that the array was
 * originally sorted in increasing order.
 * EXAMPLE
 * Input:findSin{lS, 16, 19, 2a, 25, 1, 3,4,5,7, la, 14}
 * Output: 8 (the index of 5 in the array)
 * Hints: #298, #310 
 */

(function(){
    
    
    function search(a, left, right, key){
        
        if(left>right) return -1;
        console.log(a.slice(left, right+1), key);
        const mid = Math.floor((left+right)/2);
        
        if(a[mid] === key) return mid;
        

        //check left side is in order
        if(a[left] < a[mid]){
            //if left side is in order, do normal BS
            if(a[left] <= key && key < a[mid]){
                return search(a, left, mid-1, key);
            }else{
                return search(a, mid+1, right, key);
            }
        }
        //check right side is in order
        else if(a[mid] < a[left]){
            if(a[mid] < key && key < a[right] ){
                return search(a, mid+1, right, key);
            }else{
                return search(a, left, mid-1, key);
            }
        }
        else if(a[left] === a[mid]){
            if(a[mid] === a[right]){
                //linear search
                const index = search(a, left, mid-1, key);
                if(index === -1){
                    return search(a, mid+1, right, key);
                }else{
                    return index; //-1
                }
            }else{
                return search(a, mid+1, right, key);
            }
            return -1;
        }

        
    }

    function findIndex(arr, key){
        const left = 0;
        const right = arr.length-1;
        const mid = Math.floor((left+right)/2);

        return search(arr, left, right, key);

    }

    function main(){
        var inputs = [
            [1,2,3,4,5],
            [1,2,3,4,5],
            [3,4,8,9,14,0,2],
            [2,2,2,2,3,2,2,2],
            [2,2,2,2,2,3,4,5,6],
            [3,4,5,6,2,2,2,2,2],
            [3,6,8,1,2]
        ];
        var searchKeys = [1, 5, 0, 3, 4, 4, 9];
        var expectedOutputs = [0, 4, 5, 4, 6, 1, -1];

        inputs.forEach((input, index)=>{
            const searchKey = searchKeys[index];
            const expectedOutput = expectedOutputs[index];
            const output = findIndex(input, searchKey);
            if(output === expectedOutput){
                //console.log("VALID");
                console.log();
            }else{
                console.log(input, "Received Output : "+output , "Expected Output is : " + expectedOutput);
                console.log();
            }
        });

    }

    main();
})()