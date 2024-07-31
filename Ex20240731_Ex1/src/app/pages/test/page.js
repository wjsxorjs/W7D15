import { Table, TableBody, TableCell, TableHead, TableRow } from "@mui/material";
import Button from "@mui/material/Button";

// export default function Test(){
const Test = () =>{

    const rows = [
        {name:"Java", value:3209, rank:2},
        {name:"Python", value:5239, rank:1},
        {name:"C", value:2019, rank:3}
    ];

    return(
        <div>
            <h1>테스트페이지</h1>
            <article>
                <Button variant="contained">Contained</Button>
            </article>
            <article>
                <Table sx={{ minWidth: 650 }}>
                    <TableHead>
                        <TableRow>
                            <TableCell>Programming Language</TableCell>
                            <TableCell>Users</TableCell>
                            <TableCell>Rank</TableCell>
                            <TableCell>ETC</TableCell>
                        </TableRow>
                    </TableHead>
                    <TableBody>
                        {/* JSX(Javascript Syntax eXtension)문법의 주석 */}
                        {rows.map((row) => (
                            <TableRow
                                key={row.name}
                                sx={{ '&:last-child td, &:last-child th': { border: 0 } }}
                            >
                                <TableCell>{row.name}</TableCell>
                                <TableCell>{row.value}</TableCell>
                                <TableCell>{row.rank}</TableCell>
                                <TableCell></TableCell>
                            </TableRow>
                        ))}
                    </TableBody>
                </Table>
            </article>
        </div>
    );
}

export default Test;