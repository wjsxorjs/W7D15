import { Table, TableBody, TableCell, TableHead, TableRow } from "@mui/material";
import styles from "../../css/testMenu.css";
import { green, grey } from "@mui/material/colors";

// export default function Test(){
const Page = () =>{

    const rows = [
        [1,2,3,4,5],
        [6,7,8,9,10],
        [11,12,13,14,15],
        [16,17,18,19,20],
        [21,22,23,24,25],
    ];
    return(
        <div>
            <div id="logoImg" />
            <article id="wrap">
                <header id="header">
                    <ul id="nav">
                        <li><a href="#">Menu1</a></li>
                        <li><a href="#">Menu2</a></li>
                        <li><a href="#">Menu3</a></li>
                        <li><a href="#">Menu4</a></li>
                    </ul>
                </header>
            </article>
            <article>
                <Table sx={{ minWidth: 650 }}>
                    <TableHead>
                        <TableRow>
                            <TableCell>1's</TableCell>
                            <TableCell>2's</TableCell>
                            <TableCell>3's</TableCell>
                            <TableCell>4's</TableCell>
                            <TableCell>5's</TableCell>
                        </TableRow>
                    </TableHead>
                    <TableBody>
                        {/* JSX(Javascript Syntax eXtension)문법의 주석 */}
                        {rows.map((row) => (
                            <TableRow
                                key={row[0]}
                                sx={{ '&:last-child td, &:last-child th': { border: 0 } }}
                            >
                                <TableCell>{row[0]}</TableCell>
                                <TableCell>{row[1]}</TableCell>
                                <TableCell>{row[2]}</TableCell>
                                <TableCell>{row[3]}</TableCell>
                                <TableCell>{row[4]}</TableCell>
                            </TableRow>
                        ))}
                    </TableBody>
                </Table>
            </article>
        </div>
    );
}

export default Page;