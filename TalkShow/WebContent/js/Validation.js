/**
 * 
 */
function val_postTopic()

{ 

        var x = document.postTopic.tname.value;
 
        var key=/^[a-z A-Z 0-9]+$/;

        if(x.length>0 && x.match(!key))

        {

                        return true;

                }

                else

                {

                        alert("Enter Valid Topic Name!!!");

                        return false;  

                }

}

function val_comment()

{ 
	
        var x = document.comment1.comment.value;
 
        if(x.length>0 )

        {

                        return true;

                }

                else

                {

                        alert("Enter Comment!!!");

                        return false;  

                }

}
