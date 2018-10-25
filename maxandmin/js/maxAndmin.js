var operations = {

    maxAndMin: function (arr1,arr2){

        var result = [null, null];
        for(i=0; i<arr1.length; i++ ){
            for(j=0; j<arr2.length; j++){
                if(result[0] == null || result[0] < (Math.abs(arr1[i]-arr2[j]))){
                    result[0] = Math.abs(arr1[i]-arr2[j]);
                }
                if(result[1] == null || result[1] > (Math.abs(arr1[i] - arr2[j]))){
                    result[1] = Math.abs(arr1[i] - arr2[j]);
                }
            }
        }

        return result;
    }

}

operations.maxAndMin([3,10,5], [20,7,15,8]);


