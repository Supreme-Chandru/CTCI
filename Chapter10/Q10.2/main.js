(function(){


    function sortChars(str) {
        return str.split('').sort().join('');
    }

    function groupAnagram(inp){
        var input = [].concat(inp);
        var map = {};
        for(str of input) {
            var sortedStr = sortChars(str);
            if(map[sortedStr] === undefined) {
                let arr = [];
                arr.push(str);
                map[sortedStr] = arr;
            } else {
                map[sortedStr].push(str);
            }
        }
        
        var result = [];
        for(prop in map){
            result = result.concat(map[prop]);
        }
        return result;
    }

    function main(){
        var input = ["asdf", "as", "acd", "a",  "aa", "sa", "cad", "a", "adsf", "adc"];
        var result = groupAnagram(input);
        console.log(result);
    }
    main();
})();