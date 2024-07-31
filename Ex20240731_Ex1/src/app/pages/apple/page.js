import styles from "../../css/menu.css";

function Page(){
    let title = "쌍용교육센터";
    let greyFont = {color:"#ddd", fontSize:"24px"};
    return(
        <div>
            <article id="wrap">
                <header id="header">
                    <ul id="nav">
                        <li><a href="" id="apple">&nbsp;</a></li>
                        <li><a href="">Store</a></li>
                        <li><a href="">Mac</a></li>
                        <li><a href="">ipad</a></li>
                        <li><a href="">iphone</a></li>
                        <li><a href="">Watch</a></li>
                        <li><a href="">Vision</a></li>
                        <li><a href="">Airpods</a></li>
                        <li><a href="">TV &amp; Home</a></li>
                        <li><a href="">Entertainment</a></li>
                        <li><a href="">Accessories</a></li>
                        <li><a href="">Support</a></li>
                    </ul>
                </header>
            </article>
            <div>
                <h2 style={greyFont}>{title}</h2>
            </div>
        </div>
    );
}

export default Page;